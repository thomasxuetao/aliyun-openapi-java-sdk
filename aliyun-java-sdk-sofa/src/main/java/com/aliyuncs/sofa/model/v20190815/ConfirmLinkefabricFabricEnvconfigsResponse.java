/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ConfirmLinkefabricFabricEnvconfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ConfirmLinkefabricFabricEnvconfigsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String antxChangeJson;

		private String linkeUrl;

		private List<String> antxConflictInfo;

		private List<String> delKeyList;

		public String getAntxChangeJson() {
			return this.antxChangeJson;
		}

		public void setAntxChangeJson(String antxChangeJson) {
			this.antxChangeJson = antxChangeJson;
		}

		public String getLinkeUrl() {
			return this.linkeUrl;
		}

		public void setLinkeUrl(String linkeUrl) {
			this.linkeUrl = linkeUrl;
		}

		public List<String> getAntxConflictInfo() {
			return this.antxConflictInfo;
		}

		public void setAntxConflictInfo(List<String> antxConflictInfo) {
			this.antxConflictInfo = antxConflictInfo;
		}

		public List<String> getDelKeyList() {
			return this.delKeyList;
		}

		public void setDelKeyList(List<String> delKeyList) {
			this.delKeyList = delKeyList;
		}
	}

	@Override
	public ConfirmLinkefabricFabricEnvconfigsResponse getInstance(UnmarshallerContext context) {
		return	ConfirmLinkefabricFabricEnvconfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
