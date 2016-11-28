/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.green.model.v20161124;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TextAntispamDetectionRequest extends RpcAcsRequest<TextAntispamDetectionResponse> {
	
	public TextAntispamDetectionRequest() {
		super("Green", "2016-11-24", "TextAntispamDetection", "green");
		setMethod(MethodType.POST);
	}

	private String dataItems;

	public String getDataItems() {
		return this.dataItems;
	}

	public void setDataItems(String dataItems) {
		this.dataItems = dataItems;
		putQueryParameter("DataItems", dataItems);
	}

	@Override
	public Class<TextAntispamDetectionResponse> getResponseClass() {
		return TextAntispamDetectionResponse.class;
	}

}
