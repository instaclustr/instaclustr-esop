package com.instaclustr.cassandra.backup.impl.restore;

/**
 * Resolves what restoration strategy to use based on a restoration request received.
 */
public interface RestorationStrategyResolver {

    RestorationStrategy resolve(RestoreOperationRequest request) throws Exception;
}
