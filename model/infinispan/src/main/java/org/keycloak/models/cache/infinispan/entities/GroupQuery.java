package org.keycloak.models.cache.infinispan.entities;

import org.keycloak.models.cache.infinispan.entities.InRealm;

import java.util.Set;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface GroupQuery extends InRealm {
    Set<String> getGroups();
}
