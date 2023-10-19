package org.example.factories;

import org.example.operations.ComplexOperation;
import org.example.operations.DivOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class OperationFactory {
    private static final Logger logger = LoggerFactory.getLogger(OperationFactory.class);
    private static final Map<String, ComplexOperation> mapOperation = new HashMap<>();

    public static void operationAdd(String code, ComplexOperation operation) {
        if (!mapOperation.containsKey(code)) {
            mapOperation.put(code, operation);
            logger.debug(String.format("Add operation %s", code));
        }
    }
    public static ComplexOperation getOperation(String code) {
        if (mapOperation.containsKey(code)) {
            logger.debug(String.format("Operation %s founded", code));
            return mapOperation.get(code);
        }

        logger.error(String.format("Operation %s no found", code));
        throw new IllegalArgumentException("No support operation");
    }
}
