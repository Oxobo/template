package ir.itsurena.base.core.util.dbuint.datasetcreator;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DataSetCreator {

    @Autowired
    private Environment environment;

    public IDatabaseConnection getConnection() throws DataSetCreatorException {
        try {
            Class.forName(environment.getProperty("spring.datasource.driver-class-name"));
        } catch (ClassNotFoundException e) {
            throw new DataSetCreatorException(e.getMessage());
        }
        Connection con;
        try {
            con = DriverManager.getConnection(
                    environment.getProperty("spring.datasource.url"), environment.getProperty("spring.datasource.username"), environment.getProperty("spring.datasource.password"));
        } catch (SQLException e) {
            throw new DataSetCreatorException(e.getMessage());
        }

        IDatabaseConnection connection = null;
        try {
            connection = new DatabaseConnection(con);
        } catch (DatabaseUnitException e) {
            throw new DataSetCreatorException(e.getMessage());
        }

        return connection;
    }

    public ByteArrayOutputStream getAllDataSetByTableName(String tableName) throws DataSetCreatorException, DataSetException, IOException {
        // partial database export
        QueryDataSet partialDataSet = new QueryDataSet(getConnection());
        partialDataSet.addTable(tableName, "SELECT * FROM " + tableName);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        FlatXmlDataSet.write(partialDataSet, outputStream);
        return outputStream;
    }

    public ByteArrayOutputStream getOneDataSetByTableNameAndId(String tableName, long Id) throws DataSetCreatorException, DataSetException, IOException {
        QueryDataSet partialDataSet = new QueryDataSet(getConnection());
        partialDataSet.addTable(tableName, "SELECT * FROM " + tableName + " where ID='" + Id + "'");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        FlatXmlDataSet.write(partialDataSet, outputStream);
        return outputStream;
    }

    public ByteArrayOutputStream getLimitedNumberOFDataSet(String tableName, int numberOfEntityRequest) throws DataSetCreatorException, DataSetException, IOException {
        QueryDataSet partialDataSet = new QueryDataSet(getConnection());
        partialDataSet.addTable(tableName, "SELECT * FROM " + tableName + " WHERE ROWNUM<='" + numberOfEntityRequest + "'");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        FlatXmlDataSet.write(partialDataSet, outputStream);
        return outputStream;

    }

    public ByteArrayOutputStream getDataSetByNativeQuery(String tableName, String query) throws DataSetCreatorException, DataSetException, IOException {
        QueryDataSet partialDataSet = new QueryDataSet(getConnection());
        partialDataSet.addTable(tableName, query);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        FlatXmlDataSet.write(partialDataSet, outputStream);
        return outputStream;

    }
}
