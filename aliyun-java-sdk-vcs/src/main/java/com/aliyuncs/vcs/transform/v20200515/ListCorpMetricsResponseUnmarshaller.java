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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListCorpMetricsResponse;
import com.aliyuncs.vcs.model.v20200515.ListCorpMetricsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCorpMetricsResponseUnmarshaller {

	public static ListCorpMetricsResponse unmarshall(ListCorpMetricsResponse listCorpMetricsResponse, UnmarshallerContext _ctx) {
		
		listCorpMetricsResponse.setRequestId(_ctx.stringValue("ListCorpMetricsResponse.RequestId"));
		listCorpMetricsResponse.setCode(_ctx.stringValue("ListCorpMetricsResponse.Code"));
		listCorpMetricsResponse.setMessage(_ctx.stringValue("ListCorpMetricsResponse.Message"));
		listCorpMetricsResponse.setPageNumber(_ctx.integerValue("ListCorpMetricsResponse.PageNumber"));
		listCorpMetricsResponse.setPageSize(_ctx.integerValue("ListCorpMetricsResponse.PageSize"));
		listCorpMetricsResponse.setSuccess(_ctx.stringValue("ListCorpMetricsResponse.Success"));
		listCorpMetricsResponse.setTotalCount(_ctx.integerValue("ListCorpMetricsResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCorpMetricsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCorpId(_ctx.stringValue("ListCorpMetricsResponse.Data["+ i +"].CorpId"));
			dataItem.setTagCode(_ctx.stringValue("ListCorpMetricsResponse.Data["+ i +"].TagCode"));
			dataItem.setTagMetrics(_ctx.stringValue("ListCorpMetricsResponse.Data["+ i +"].TagMetrics"));
			dataItem.setTagValue(_ctx.stringValue("ListCorpMetricsResponse.Data["+ i +"].TagValue"));

			data.add(dataItem);
		}
		listCorpMetricsResponse.setData(data);
	 
	 	return listCorpMetricsResponse;
	}
}