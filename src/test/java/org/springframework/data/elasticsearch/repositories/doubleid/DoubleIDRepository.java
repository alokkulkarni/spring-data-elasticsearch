/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.elasticsearch.repositories.doubleid;

import org.springframework.data.elasticsearch.entities.DoubleIDEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author Ryan Henszey
 * @author Mohsin Husen
 */

public interface DoubleIDRepository extends ElasticsearchRepository<DoubleIDEntity, Double> {

}
