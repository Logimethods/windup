package org.jboss.windup.config.query;

public interface QueryBuilderFrom
{
    /**
     * Narrow the query via a {@link QueryGremlinCriterion} in order to execute Gremlin queries.
     */
    QueryBuilderPiped piped(QueryGremlinCriterion criterion);
}
