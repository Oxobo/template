package ir.itsurena.base.core.util.mapper;

import org.modelmapper.ModelMapper;

public class ModelMapperUtil {

    public static ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }
}
