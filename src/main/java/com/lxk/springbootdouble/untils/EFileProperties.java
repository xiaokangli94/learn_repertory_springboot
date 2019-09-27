package com.lxk.springbootdouble.untils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:eFile.properties")
@Component
public class EFileProperties {
    //JYTODD_NDJSDL_eFile_template
    @Value("${JYTODD.NDJSDL.eFile.title}")
    private String NDJSDLTitle;
    @Value("${JYTODD.NDJSDL.eFile.keys}")
    private String NDJSDLKeys;
    @Value("${JYTODD.NDJSDL.eFile.bottom}")
    private String NDJSDLBottom;

    //JYTODD_NDJSDL_eFile_template
    @Value("${JYTODD.ZCQJYDL_01.eFile.title}")
    private String ZCQJYDL_01Title;
    @Value("${JYTODD.ZCQJYDL_01.eFile.keys}")
    private String ZCQJYDL_01Keys;
    @Value("${JYTODD.ZCQJYDL_01.eFile.bottom}")
    private String ZCQJYDL_01Bottom;

    @Value("${JYTODD.ZCQJYDL_02.eFile.title}")
    private String ZCQJYDL_02Title;
    @Value("${JYTODD.ZCQJYDL_02.eFile.keys}")
    private String ZCQJYDL_02Keys;
    @Value("${JYTODD.ZCQJYDL_02.eFile.bottom}")
    private String ZCQJYDL_02Bottom;

    @Value("${JYTODD.ZCQJYDL_03.eFile.title}")
    private String ZCQJYDL_03Title;
    @Value("${JYTODD.ZCQJYDL_03.eFile.keys}")
    private String ZCQJYDL_03Keys;
    @Value("${JYTODD.ZCQJYDL_03.eFile.bottom}")
    private String ZCQJYDL_03Bottom;

    @Value("${JYTODD.ZCQJYDL_04.eFile.title}")
    private String ZCQJYDL_04Title;
    @Value("${JYTODD.ZCQJYDL_04.eFile.keys}")
    private String ZCQJYDL_04Keys;
    @Value("${JYTODD.ZCQJYDL_04.eFile.bottom}")
    private String ZCQJYDL_04Bottom;

    @Value("${JYTODD.ZCQJYDL_05.eFile.title}")
    private String ZCQJYDL_05Title;
    @Value("${JYTODD.ZCQJYDL_05.eFile.keys}")
    private String ZCQJYDL_05Keys;
    @Value("${JYTODD.ZCQJYDL_05.eFile.bottom}")
    private String ZCQJYDL_05Bottom;

    @Value("${JYTODD.ZCQJYDL_06.eFile.title}")
    private String ZCQJYDL_06Title;
    @Value("${JYTODD.ZCQJYDL_06.eFile.keys}")
    private String ZCQJYDL_06Keys;
    @Value("${JYTODD.ZCQJYDL_06.eFile.bottom}")
    private String ZCQJYDL_06Bottom;

    //JYTODD_ZCQSYDL_eFile_template
    @Value("${JYTODD.ZCQSYDL_01.eFile.title}")
    private String ZCQSYDL_01Title;
    @Value("${JYTODD.ZCQSYDL_01.eFile.keys}")
    private String ZCQSYDL_01Keys;
    @Value("${JYTODD.ZCQSYDL_01.eFile.bottom}")
    private String ZCQSYDL_01Bottom;

    @Value("${JYTODD.ZCQSYDL_02.eFile.title}")
    private String ZCQSYDL_02Title;
    @Value("${JYTODD.ZCQSYDL_02.eFile.keys}")
    private String ZCQSYDL_02Keys;
    @Value("${JYTODD.ZCQSYDL_02.eFile.bottom}")
    private String ZCQSYDL_02Bottom;

    @Value("${JYTODD.ZCQSYDL_03.eFile.title}")
    private String ZCQSYDL_03Title;
    @Value("${JYTODD.ZCQSYDL_03.eFile.keys}")
    private String ZCQSYDL_03Keys;
    @Value("${JYTODD.ZCQSYDL_03.eFile.bottom}")
    private String ZCQSYDL_03Bottom;

    //JYTODD_ZCQJYFJQX_eFile_template
    @Value("${JYTODD.ZCQJYFJQX_01.eFile.title}")
    private String ZCQJYFJQX_01Title;
    @Value("${JYTODD.ZCQJYFJQX_01.eFile.keys}")
    private String ZCQJYFJQX_01Keys;
    @Value("${JYTODD.ZCQJYFJQX_01.eFile.bottom}")
    private String ZCQJYFJQX_01Bottom;

    @Value("${JYTODD.ZCQJYFJQX_02.eFile.title}")
    private String ZCQJYFJQX_02Title;
    @Value("${JYTODD.ZCQJYFJQX_02.eFile.keys}")
    private String ZCQJYFJQX_02Keys;
    @Value("${JYTODD.ZCQJYFJQX_02.eFile.bottom}")
    private String ZCQJYFJQX_02Bottom;

    @Value("${JYTODD.ZCQJYFJQX_03.eFile.title}")
    private String ZCQJYFJQX_03Title;
    @Value("${JYTODD.ZCQJYFJQX_03.eFile.keys}")
    private String ZCQJYFJQX_03Keys;
    @Value("${JYTODD.ZCQJYFJQX_03.eFile.bottom}")
    private String ZCQJYFJQX_03Bottom;

    //JYTODD_NDQKJSYDL_eFile_template
    @Value("${JYTODD.NDQKJSYDL.eFile.title}")
    private String NDQKJSYDLTitle;
    @Value("${JYTODD.NDQKJSYDL.eFile.keys}")
    private String NDQKJSYDLKeys;
    @Value("${JYTODD.NDQKJSYDL.eFile.bottom}")
    private String NDQKJSYDLBottom;

    //JYTODD_ZCQJSSJ_eFile_template
    @Value("${JYTODD.ZCQJSSJ.eFile.title}")
    private String ZCQJSSJTitle;
    @Value("${JYTODD.ZCQJSSJ.eFile.keys}")
    private String ZCQJSSJKeys;
    @Value("${JYTODD.ZCQJSSJ.eFile.bottom}")
    private String ZCQJSSJBottom;

    //JYTODD_JZQTFY_eFile_template
    @Value("${JYTODD.JZQTFY.eFile.title}")
    private String JZQTFYTitle;
    @Value("${JYTODD.JZQTFY.eFile.keys}")
    private String JZQTFYKeys;
    @Value("${JYTODD.JZQTFY.eFile.bottom}")
    private String JZQTFYBottom;

    //JYTODD_JZXHSCBJ_eFile_template
    @Value("${JYTODD.JZXHSCBJ.eFile.title}")
    private String JZXHSCBJTitle;
    @Value("${JYTODD.JZXHSCBJ.eFile.keys}")
    private String JZXHSCBJKeys;
    @Value("${JYTODD.JZXHSCBJ.eFile.bottom}")
    private String JZXHSCBJBottom;

    //DDSWDLHZB
    @Value("${JYTODD.DDSWDLHZB.eFile.title}")
    private String DDSWDLHZBTitle;
    @Value("${JYTODD.DDSWDLHZB.eFile.keys}")
    private String DDSWDLHZBKeys;
    @Value("${JYTODD.DDSWDLHZB.eFile.bottom}")
    private String DDSWDLHZBBottom;

    //FJ1.JYTODD_JZSDTFBJ_eFile_template
    @Value("${JYTODD.JZSDTFBJ.eFile.title}")
    private String JZSDTFBJTitle;
    @Value("${JYTODD.JZSDTFBJ.eFile.keys}")
    private String JZSDTFBJKeys;
    @Value("${JYTODD.JZSDTFBJ.eFile.bottom}")
    private String JZSDTFBJBottom;

    //FJ2.JYTODD_JZQTTFBJ_eFile_template
    @Value("${JYTODD.JZQTTFBJ.eFile.title}")
    private String JZQTTFBJTitle;
    @Value("${JYTODD.JZQTTFBJ.eFile.keys}")
    private String JZQTTFBJKeys;
    @Value("${JYTODD.JZQTTFBJ.eFile.bottom}")
    private String JZQTTFBJBottom;

    //FJ3.JYTODD_JZTPBJ_eFile_template
    @Value("${JYTODD.JZTPBJ.eFile.title}")
    private String JZTPBJTitle;
    @Value("${JYTODD.JZTPBJ.eFile.keys}")
    private String JZTPBJKeys;
    @Value("${JYTODD.JZTPBJ.eFile.bottom}")
    private String JZTPBJBottom;

    //FJ4.JYTODD_JZRQDNBJ_eFile_template
    @Value("${JYTODD.JZRQDNBJ.eFile.title}")
    private String JZRQDNBJTitle;
    @Value("${JYTODD.JZRQDNBJ.eFile.keys}")
    private String JZRQDNBJKeys;
    @Value("${JYTODD.JZRQDNBJ.eFile.bottom}")
    private String JZRQDNBJBottom;

    //FJ5.JYTODD_JZSSPHBJ_eFile_template
    @Value("${JYTODD.JZSSPHBJ.eFile.title}")
    private String JZSSPHBJTitle;
    @Value("${JYTODD.JZSSPHBJ.eFile.keys}")
    private String JZSSPHBJKeys;
    @Value("${JYTODD.JZSSPHBJ.eFile.bottom}")
    private String JZSSPHBJBottom;

    //FJ6.JYTODD_JZYDZCQDLZJ_eFile_template
    @Value("${JYTODD.JZYDZCQDLZJ.eFile.title}")
    private String JZYDZCQDLZJTitle;
    @Value("${JYTODD.JZYDZCQDLZJ.eFile.keys}")
    private String JZYDZCQDLZJKeys;
    @Value("${JYTODD.JZYDZCQDLZJ.eFile.bottom}")
    private String JZYDZCQDLZJBottom;

    //FJ7.JYTODD_ZCQQXFJYDR_eFile_template
    @Value("${JYTODD.ZCQQXFJYDR.eFile.title}")
    private String ZCQQXFJYDRTitle;
    @Value("${JYTODD.ZCQQXFJYDR.eFile.keys}")
    private String ZCQQXFJYDRKeys;
    @Value("${JYTODD.ZCQQXFJYDR.eFile.bottom}")
    private String ZCQQXFJYDRBottom;

    //FJ8.JYTODD_ZCQQXFJRDS_eFile_template
    @Value("${JYTODD.ZCQQXFJRDS.eFile.title}")
    private String ZCQQXFJRDSTitle;
    @Value("${JYTODD.ZCQQXFJRDS.eFile.keys}")
    private String ZCQQXFJRDSKeys;
    @Value("${JYTODD.ZCQQXFJRDS.eFile.bottom}")
    private String ZCQQXFJRDSBottom;

    //FJ8.JYTODD_HDRMJZXX_eFile_template
    @Value("${JYTODD.HDRMJZXX.eFile.title}")
    private String HDRMJZXXTitle;
    @Value("${JYTODD.HDRMJZXX.eFile.keys}")
    private String HDRMJZXXKeys;
    @Value("${JYTODD.HDRMJZXX.eFile.bottom}")
    private String HDRMJZXXBottom;

    //JYTODD.JYJBXX.eFile.template
    @Value("${JYTODD.JYJBXX.eFile.title}")
    private String JYJBXXTitle;
    @Value("${JYTODD.JYJBXX.eFile.keys}")
    private String JYJBXXKeys;
    @Value("${JYTODD.JYJBXX.eFile.bottom}")
    private String JYJBXXBottom;

    //JYTODD.DLMXSCF.eFile.template
    @Value("${JYTODD.DLMXSCF.eFile.title}")
    private String DLMXSCFTitle;
    @Value("${JYTODD.DLMXSCF.eFile.keys}")
    private String DLMXSCFKeys;
    @Value("${JYTODD.DLMXSCF.eFile.bottom}")
    private String DLMXSCFBottom;

    //JYTODD.DLMXSRF.eFile.template
    @Value("${JYTODD.DLMXSRF.eFile.title}")
    private String DLMXSRFTitle;
    @Value("${JYTODD.DLMXSRF.eFile.keys}")
    private String DLMXSRFKeys;
    @Value("${JYTODD.DLMXSRF.eFile.bottom}")
    private String DLMXSRFBottom;

    //JYTODD.DLMX.eFile.template
    @Value("${JYTODD.DLMX.eFile.title}")
    private String DLMXTitle;
    @Value("${JYTODD.DLMX.eFile.keys}")
    private String DLMXKeys;
    @Value("${JYTODD.DLMX.eFile.bottom}")
    private String DLMXBottom;

}
