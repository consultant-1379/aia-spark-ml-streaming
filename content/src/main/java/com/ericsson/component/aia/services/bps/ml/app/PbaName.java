/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 * 
 * Problem Statement
 * 
 * *****************
 * 
 * The input data is the iris dataset. It contains recordings of
 * information about flower samples. For each sample, the petal and
 * sepal length and width are recorded along with the type of the
 * flower. We need to use this dataset to build a decision tree
 * model that can predict the type of flower based on the petal
 * and sepal information.
 * 
 * Techniques Used
 * 
 * 1. Decision Trees
 * 2. Training and Testing
 * 3. Confusion Matrix
 *  
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.component.aia.services.bps.ml.app;


import com.ericsson.component.aia.services.bps.spark.jobrunner.ml.SparkMLStreamJobRunner;
import org.apache.avro.generic.GenericRecord;
import org.apache.spark.streaming.api.java.JavaPairDStream;


public class PbaName extends SparkMLStreamJobRunner {

    @Override
    public void executeJob() {

        //Gets Batch data as defined in flow.xml  
        final JavaPairDStream<String, GenericRecord> stream = (JavaPairDStream<String, GenericRecord>) inputStreams.getStreams("input-stream");

         /**
          * Write your business logic here and deploy application
          * 
          * **/
        
        
       /*
        * To save model/Output to Hdfs, file etc as defined in flow.xml use getOutGoing() .
        */
       // getOutGoing().write(df);
    }

    @Override
    public void cleanUp() {
    }

}
