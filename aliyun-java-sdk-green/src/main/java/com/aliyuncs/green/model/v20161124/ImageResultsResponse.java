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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20161124.ImageResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ImageResultsResponse extends AcsResponse {

	private String code;

	private String msg;

	private List<ImageDetectResult> imageDetectResults;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<ImageDetectResult> getImageDetectResults() {
		return this.imageDetectResults;
	}

	public void setImageDetectResults(List<ImageDetectResult> imageDetectResults) {
		this.imageDetectResults = imageDetectResults;
	}

	public static class ImageDetectResult {

		private String code;

		private String msg;

		private String status;

		private ImageResult imageResult;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public ImageResult getImageResult() {
			return this.imageResult;
		}

		public void setImageResult(ImageResult imageResult) {
			this.imageResult = imageResult;
		}

		public static class ImageResult {

			private String taskId;

			private String imageName;

			private PornResult pornResult;

			private IllegalResult illegalResult;

			private OcrResult ocrResult;

			private SpamResult spamResult;

			private QrcodeResult qrcodeResult;

			private SensitiveFaceResult sensitiveFaceResult;

			private ErrorResult errorResult;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getImageName() {
				return this.imageName;
			}

			public void setImageName(String imageName) {
				this.imageName = imageName;
			}

			public PornResult getPornResult() {
				return this.pornResult;
			}

			public void setPornResult(PornResult pornResult) {
				this.pornResult = pornResult;
			}

			public IllegalResult getIllegalResult() {
				return this.illegalResult;
			}

			public void setIllegalResult(IllegalResult illegalResult) {
				this.illegalResult = illegalResult;
			}

			public OcrResult getOcrResult() {
				return this.ocrResult;
			}

			public void setOcrResult(OcrResult ocrResult) {
				this.ocrResult = ocrResult;
			}

			public SpamResult getSpamResult() {
				return this.spamResult;
			}

			public void setSpamResult(SpamResult spamResult) {
				this.spamResult = spamResult;
			}

			public QrcodeResult getQrcodeResult() {
				return this.qrcodeResult;
			}

			public void setQrcodeResult(QrcodeResult qrcodeResult) {
				this.qrcodeResult = qrcodeResult;
			}

			public SensitiveFaceResult getSensitiveFaceResult() {
				return this.sensitiveFaceResult;
			}

			public void setSensitiveFaceResult(SensitiveFaceResult sensitiveFaceResult) {
				this.sensitiveFaceResult = sensitiveFaceResult;
			}

			public ErrorResult getErrorResult() {
				return this.errorResult;
			}

			public void setErrorResult(ErrorResult errorResult) {
				this.errorResult = errorResult;
			}

			public static class PornResult {

				private Float rate;

				private Integer label;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public Integer getLabel() {
					return this.label;
				}

				public void setLabel(Integer label) {
					this.label = label;
				}
			}

			public static class IllegalResult {

				private Float rate;

				private Integer label;

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public Integer getLabel() {
					return this.label;
				}

				public void setLabel(Integer label) {
					this.label = label;
				}
			}

			public static class OcrResult {

				private List<String> text;

				public List<String> getText() {
					return this.text;
				}

				public void setText(List<String> text) {
					this.text = text;
				}
			}

			public static class SpamResult {

				private Boolean hit;

				private List<KeywordResult> keywordResults;

				public Boolean getHit() {
					return this.hit;
				}

				public void setHit(Boolean hit) {
					this.hit = hit;
				}

				public List<KeywordResult> getKeywordResults() {
					return this.keywordResults;
				}

				public void setKeywordResults(List<KeywordResult> keywordResults) {
					this.keywordResults = keywordResults;
				}

				public static class KeywordResult {

					private String keywordCtx;

					private String keywordType;

					public String getKeywordCtx() {
						return this.keywordCtx;
					}

					public void setKeywordCtx(String keywordCtx) {
						this.keywordCtx = keywordCtx;
					}

					public String getKeywordType() {
						return this.keywordType;
					}

					public void setKeywordType(String keywordType) {
						this.keywordType = keywordType;
					}
				}
			}

			public static class QrcodeResult {

				private List<String> qrcodeList;

				public List<String> getQrcodeList() {
					return this.qrcodeList;
				}

				public void setQrcodeList(List<String> qrcodeList) {
					this.qrcodeList = qrcodeList;
				}
			}

			public static class SensitiveFaceResult {

				private List<ImageSensitiveFaceHitItem> items;

				public List<ImageSensitiveFaceHitItem> getItems() {
					return this.items;
				}

				public void setItems(List<ImageSensitiveFaceHitItem> items) {
					this.items = items;
				}

				public static class ImageSensitiveFaceHitItem {

					private Float x;

					private Float y;

					private Float w;

					private Float h;

					private List<ImageSensitiveFaceSimiInfo> simiInfoList;

					public Float getX() {
						return this.x;
					}

					public void setX(Float x) {
						this.x = x;
					}

					public Float getY() {
						return this.y;
					}

					public void setY(Float y) {
						this.y = y;
					}

					public Float getw() {
						return this.w;
					}

					public void setw(Float w) {
						this.w = w;
					}

					public Float geth() {
						return this.h;
					}

					public void seth(Float h) {
						this.h = h;
					}

					public List<ImageSensitiveFaceSimiInfo> getSimiInfoList() {
						return this.simiInfoList;
					}

					public void setSimiInfoList(List<ImageSensitiveFaceSimiInfo> simiInfoList) {
						this.simiInfoList = simiInfoList;
					}

					public static class ImageSensitiveFaceSimiInfo {

						private String name;

						private Float score;

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public Float getScore() {
							return this.score;
						}

						public void setScore(Float score) {
							this.score = score;
						}
					}
				}
			}

			public static class ErrorResult {

				private String code;

				private String msg;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getMsg() {
					return this.msg;
				}

				public void setMsg(String msg) {
					this.msg = msg;
				}
			}
		}
	}

	@Override
	public ImageResultsResponse getInstance(UnmarshallerContext context) {
		return	ImageResultsResponseUnmarshaller.unmarshall(this, context);
	}
}
