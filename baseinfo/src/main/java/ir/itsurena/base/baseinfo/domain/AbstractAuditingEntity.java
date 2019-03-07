package ir.itsurena.base.baseinfo.domain;

import java.util.Date;

public abstract class AbstractAuditingEntity {

    private String createBy;
    private Date createDate;
    private String modifyBy;
    private Date modifyDate;

}
