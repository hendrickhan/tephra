package org.lpw.tephra.dao.orm.hibernate;

import org.lpw.tephra.dao.model.Model;
import org.lpw.tephra.dao.orm.Orm;
import org.lpw.tephra.dao.orm.PageList;

import java.util.Iterator;

/**
 * HibernateORM。主要提供基于Hibernate的ORM支持。
 *
 * @author lpw
 */
public interface HibernateOrm extends Orm<HibernateQuery> {
    /**
     * 检索满足条件的数据。
     *
     * @param query 检索条件。
     * @param args  参数集。
     * @return Model实例集。
     */
    <T extends Model> Iterator<T> iterate(HibernateQuery query, Object[] args);
}