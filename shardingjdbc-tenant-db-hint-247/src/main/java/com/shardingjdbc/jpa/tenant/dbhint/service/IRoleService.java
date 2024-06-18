package com.shardingjdbc.jpa.tenant.dbhint.service;

import com.shardingjdbc.jpa.tenant.dbhint.entity.Role;
import com.shardingjdbc.jpa.tenant.dbhint.entity.query.RoleQueryBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IRoleService extends IBaseService<Role, Long> {

    /**
     * find page by query.
     *
     * @param roleQueryBean query
     * @param pageRequest   pageRequest
     * @return page
     */
    Page<Role> findPage(RoleQueryBean roleQueryBean, PageRequest pageRequest);

}
