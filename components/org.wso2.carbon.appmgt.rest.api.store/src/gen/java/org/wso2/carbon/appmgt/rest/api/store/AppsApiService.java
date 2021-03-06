package org.wso2.carbon.appmgt.rest.api.store;

import org.wso2.carbon.appmgt.rest.api.store.*;
import org.wso2.carbon.appmgt.rest.api.store.dto.*;

import org.wso2.carbon.appmgt.rest.api.store.dto.InstallDTO;
import org.wso2.carbon.appmgt.rest.api.store.dto.ErrorDTO;
import org.wso2.carbon.appmgt.rest.api.store.dto.EventsDTO;
import org.wso2.carbon.appmgt.rest.api.store.dto.FavouritePageDTO;
import java.io.File;
import org.wso2.carbon.appmgt.rest.api.store.dto.AppListDTO;
import org.wso2.carbon.appmgt.rest.api.store.dto.AppDTO;
import org.wso2.carbon.appmgt.rest.api.store.dto.AppRatingListDTO;
import org.wso2.carbon.appmgt.rest.api.store.dto.AppRatingInfoDTO;
import org.wso2.carbon.appmgt.rest.api.store.dto.UserIdListDTO;
import org.wso2.carbon.appmgt.rest.api.store.dto.TagListDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public abstract class AppsApiService {
    public abstract Response appsDownloadPost(String contentType,InstallDTO install);
    public abstract Response appsMobileIdAppIdDownloadPost(String appId,String contentType);
    public abstract Response appsEventPublishPost(EventsDTO events,String contentType);
    public abstract Response appsFavouritePageGet(String accept,String ifNoneMatch);
    public abstract Response appsFavouritePagePost();
    public abstract Response appsFavouritePageDelete();
    public abstract Response appsMobileBinariesFileNameGet(String fileName,String ifMatch,String ifUnmodifiedSince);
    public abstract Response appsMobileBinariesOneTimeUuidGet(String uuid,String ifMatch,String ifUnmodifiedSince);
    public abstract Response appsMobilePlistAppIdUuidGet(String appId,String uuid,String ifMatch,String ifUnmodifiedSince);
    public abstract Response appsStaticContentsFileNameGet(String appType,String fileName,String ifMatch,String ifUnmodifiedSince);
    public abstract Response appsUninstallationPost(String contentType, InstallDTO install);
    public abstract Response appsAppTypeGet(String appType,String query,String fieldFilter,Integer limit,Integer offset,String accept,String ifNoneMatch);
    public abstract Response appsAppTypeIdAppIdGet(String appType,String appId,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract Response appsAppTypeIdAppIdFavouriteAppPost(String appType,String appId,String contentType);
    public abstract Response appsAppTypeIdAppIdFavouriteAppDelete(String appType,String appId,String contentType);
    public abstract Response appsAppTypeIdAppIdRateGet(String appType,String appId,Integer limit,Integer offset,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract Response appsAppTypeIdAppIdRatePut(String appType,String appId,AppRatingInfoDTO rating,String contentType,String ifMatch,String ifUnmodifiedSince);
    public abstract Response appsAppTypeIdAppIdStorageFileNameGet(String appType,String appId,String fileName,String ifMatch,String ifUnmodifiedSince);
    public abstract Response appsAppTypeIdAppIdSubscriptionGet(String appType,String appId,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract Response appsAppTypeIdAppIdSubscriptionPost(String appType,String appId,String contentType);
    public abstract Response appsAppTypeIdAppIdSubscriptionWorkflowPost(String appType,String appId,String contentType);
    public abstract Response appsAppTypeIdAppIdSubscriptionUsersGet(String appType,String appId,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract Response appsAppTypeIdAppIdUnsubscriptionPost(String appType,String appId,String contentType);
    public abstract Response appsAppTypeTagsGet(String appType,String accept,String ifNoneMatch);
    public abstract Response appsMobileScheduleInstallPost(String contentType, ScheduleDTO schedule,
                                                           SecurityContext securityContext);
    public abstract Response appsAppTypeIdAppIdDocsDocumentIdContentGet(String appId,String documentId,String appType,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract Response appsAppTypeIdAppIdDocsDocumentIdGet(String appType,String appId,String documentId,String ifMatch,String ifUnmodifiedSince);
    public abstract Response appsAppTypeIdAppIdDocsGet(String appType,String appId,Integer limit,Integer offset,String accept,String ifNoneMatch);
    public abstract Response appsMobileScheduleUpdatePost(String contentType, ScheduleDTO schedule,
                                                          SecurityContext securityContext);
}

