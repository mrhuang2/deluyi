package org.deluyi.sqlSession;

import org.deluyi.pojo.Configuration;
import org.deluyi.pojo.MappedStatement;

import java.util.List;

public interface Executor {

    public <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

}
