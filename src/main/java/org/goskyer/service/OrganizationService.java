package org.goskyer.service;

/**
 * Created by OoO on 2017/3/5.
 */
public interface OrganizationService {

    void findAll();

    void find(String bodyId, String organizationId, String name);

    void create(String bodyId, String logoUrl, String name, String description, String link);

    void update(String bodyId, String logoUrl, String name, String description, String link);

    void delete(String bodyId);

}
