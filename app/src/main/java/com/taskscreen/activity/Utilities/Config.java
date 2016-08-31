package com.taskscreen.activity.Utilities;

/**
 * Created by vanip_000 on 03-08-2016.
 */
public class Config {

    //url

    public static final String UPLOAD_COMPANY_AVATAR="https://production-qa.salesbox.com/enterprise-v3.2/company/updateAvatar";


    public static final String GET_COMPANY_AVATAR="https://ams01.objectstorage.softlayer.net/" +
            "v1/AUTH_a5a91c99-65b2-42f7-b169-14a0542e9730/salesboxfiles/{lastThreeCharacterOfAvatarId}/AvatarId";

    public static final String UPDATE_COMPANY_INFO="https://production-qa.salesbox.com/" +
            "enterprise-v3.2/company/update?token=8e004a22-f3a2-45ec-b582-e5c351015d09";

    public static final String GET_COMPANY_INFO="https://production-qa.salesbox.com/enterprise-v3.2/" +
            "company/get?token=8e004a22-f3a2-45ec-b582-e5c351015d09";

    public static final String LOGIN_SCREEN="https://dev.salesbox.com/enterprise-v3.4/user/login";

    public static final String SIGN_UP="https://dev.salesbox.com/enterprise-v3.4/company/requestSetupNew?timezone=7";

    public static final String SALES_CURRENCY="https://production-qa.salesbox.com/administration-v3.2/workData/workData/currencies?token=8e004a22-f3a2-45ec-b582-e5c351015d09";

    public static final String REGULAR_SALE_YEAR="https://production-qa.salesbox.com/enterprise-v3.2/budget/listByYear?token=8e004a22-f3a2-45ec-b582-e5c351015d09&year=2016";

    public static final String AVGDEAL_DAYS_SIZE="https://production-qa.salesbox.com/administration-v3.2/workData/workData?token=8e004a22-f3a2-45ec-b582-e5c351015d09";
}
