package org.wso2.siddhi.gpl.extension.nlp;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.wso2.siddhi.core.SiddhiManager;
import org.wso2.siddhi.core.config.SiddhiContext;

import org.wso2.siddhi.core.config.ExecutionPlanContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malithi on 9/10/14.
 */
public abstract class NlpTransformProcessorTestCase {

    private static Logger logger = Logger.getLogger(NlpTransformProcessorTestCase.class);

    protected static SiddhiManager siddhiManager;
    protected static SiddhiContext sc;
    protected static ExecutionPlanContext ec;
    protected long start;
    protected long end;

    public abstract void setUpChild();

    @BeforeClass
    public static void setUp() throws Exception {
        logger.info("Init Siddhi");
        siddhiManager = new SiddhiManager();
        //SiddhiConfiguration siddhiConfiguration = new SiddhiConfiguration();

        //List<Class> extensions = new ArrayList<Class>(6);
        //extensions.add(NameEntityTypeTransformProcessor.class);

        //siddhiConfiguration.setSiddhiExtensions(extensions);

        //siddhiManager = new SiddhiManager(siddhiConfiguration);

    }

    @Before
    public void setUpChildren(){
        setUpChild();
    }

    @AfterClass
    public static void tearDown() throws Exception{
        Thread.sleep(1000);
        logger.info("Shutting down Siddhi");
        //siddhiManager.shutdown();
    }

}
