package mx.com.xoco.nuniez.entities.Z11116;

import org.hibernate.dialect.PostgreSQL82Dialect;

import java.sql.Types;

public class CustomPostgresqlDialect extends PostgreSQL82Dialect {
    public CustomPostgresqlDialect() {
        super();
        registerColumnType( Types.INTEGER, "int8" );
        registerColumnType( Types.FLOAT, "float8" );
    }
}
