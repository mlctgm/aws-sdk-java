/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Server Certificates Request Marshaller
 */
public class ListServerCertificatesRequestMarshaller implements Marshaller<Request<ListServerCertificatesRequest>, ListServerCertificatesRequest> {

    public Request<ListServerCertificatesRequest> marshall(ListServerCertificatesRequest listServerCertificatesRequest) {
        Request<ListServerCertificatesRequest> request = new DefaultRequest<ListServerCertificatesRequest>(listServerCertificatesRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "ListServerCertificates");
        request.addParameter("Version", "2010-05-08");
        if (listServerCertificatesRequest != null) {
            if (listServerCertificatesRequest.getPathPrefix() != null) {
                request.addParameter("PathPrefix", StringUtils.fromString(listServerCertificatesRequest.getPathPrefix()));
            }
        }
        if (listServerCertificatesRequest != null) {
            if (listServerCertificatesRequest.getMarker() != null) {
                request.addParameter("Marker", StringUtils.fromString(listServerCertificatesRequest.getMarker()));
            }
        }
        if (listServerCertificatesRequest != null) {
            if (listServerCertificatesRequest.getMaxItems() != null) {
                request.addParameter("MaxItems", StringUtils.fromInteger(listServerCertificatesRequest.getMaxItems()));
            }
        }


        return request;
    }
}
