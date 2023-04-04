/*
 * Copyright 2014-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.map;

import java.util.UUID;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import org.springframework.data.annotation.Id;

/**
 * A domain type.
 *
 * @author Oliver Gierke
 */
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
public class Person {

	private final @Id UUID id = UUID.randomUUID();
	private final String firstname;
	private final String lastname;
	private final int age;
}
