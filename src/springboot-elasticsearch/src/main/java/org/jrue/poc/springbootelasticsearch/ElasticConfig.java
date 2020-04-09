package org.jrue.poc.springbootelasticsearch;

import org.elasticsearch.node.NodeBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories
public class ElasticConfig {

    public NodeBuilder nodeBuilder() {
        return new NodeBuilder();
    }
}
