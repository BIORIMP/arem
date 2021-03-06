package edu.wayne.cs.severe.redress2.entity.refactoring.opers;

import edu.wayne.cs.severe.redress2.controller.HierarchyBuilder;
import edu.wayne.cs.severe.redress2.controller.metric.*;
import edu.wayne.cs.severe.redress2.entity.MethodDeclaration;
import edu.wayne.cs.severe.redress2.entity.TypeDeclaration;
import edu.wayne.cs.severe.redress2.entity.refactoring.RefactoringParameter;
import edu.wayne.cs.severe.redress2.entity.refactoring.formulas.pdm.*;
import edu.wayne.cs.severe.redress2.entity.refactoring.json.JSONRefParam;
import edu.wayne.cs.severe.redress2.entity.refactoring.json.OBSERVRefParam;
import edu.wayne.cs.severe.redress2.exception.RefactoringException;
import edu.wayne.cs.severe.redress2.utils.RefactoringUtils;

import java.util.HashMap;
import java.util.List;

public class PushDownMethod extends RefactoringType {

    public PushDownMethod(List<TypeDeclaration> sysTypeDcls,
                          HierarchyBuilder builder) {
        super(sysTypeDcls);
        formulas.put(new LOCMetric().getMetricAcronym(),
                new LOCPushDownMethodPF());
        formulas.put(new NOMMetric().getMetricAcronym(),
                new NOMPushDownMethodPF());
        formulas.put(new RFCMetric().getMetricAcronym(),
                new RFCPushDownMethodPF());
        formulas.put(new CBOMetric().getMetricAcronym(),
                new CBOPushDownMethodPF(builder));
        formulas.put(new MPCMetric().getMetricAcronym(),
                new MPCPushDownMethodPF());
        formulas.put(new LCOM5Metric().getMetricAcronym(),
                new LCOM5PushDownMethodPF());
        formulas.put(new LCOM2Metric().getMetricAcronym(),
                new LCOM2PushDownMethodPF());
        formulas.put(new CYCLOMetric().getMetricAcronym(),
                new CYCLOPushDownMethodPF());

    }

    @Override
    public String getAcronym() {
        return "PDM";
    }

    @Override
    public HashMap<String, List<RefactoringParameter>> getRefactoringParams(
            List<JSONRefParam> jsonParams) throws RefactoringException {

        String key = "src";
        String key2 = "tgt";
        String key3 = "mtd";

        HashMap<String, JSONRefParam> idxParams = RefactoringUtils
                .validateJsonParams(jsonParams, 3, new String[]{key, key2,
                        key3}, new int[]{1, 0, 1});

        HashMap<String, List<RefactoringParameter>> params = new HashMap<String, List<RefactoringParameter>>();
        JSONRefParam jsonParam = idxParams.get(key);
        List<RefactoringParameter> refParams = RefactoringUtils
                .getOpersCodeObject(jsonParam, sysTypeDcls,
                        TypeDeclaration.class);
        params.put(key, refParams);

        jsonParam = idxParams.get(key2);
        refParams = RefactoringUtils.getOpersCodeObject(jsonParam, sysTypeDcls,
                TypeDeclaration.class);
        params.put(key2, refParams);

        jsonParam = idxParams.get(key3);
        refParams = RefactoringUtils.getOpersCodeObject(jsonParam, sysTypeDcls,
                MethodDeclaration.class);
        params.put(key3, refParams);

        return params;
    }

    //danaderp vers 1000
    @Override
    public HashMap<String, List<RefactoringParameter>> getOBSERVRefactoringParams(List<OBSERVRefParam> jsonParams)
            throws RefactoringException {
        // TODO Auto-generated method stub
        String key = "src";
        String key2 = "tgt";
        String key3 = "mtd";

        HashMap<String, OBSERVRefParam> idxParams = RefactoringUtils
                .validateObservParams(jsonParams, 3, new String[]{key, key2,
                        key3}, new int[]{1, 0, 1});

        HashMap<String, List<RefactoringParameter>> params = new HashMap<String, List<RefactoringParameter>>();
        OBSERVRefParam jsonParam = idxParams.get(key);
        List<RefactoringParameter> refParams = RefactoringUtils
                .getOpersCodeObject(jsonParam, sysTypeDcls,
                        TypeDeclaration.class);
        params.put(key, refParams);

        jsonParam = idxParams.get(key2);
        refParams = RefactoringUtils.getOpersCodeObject(jsonParam, sysTypeDcls,
                TypeDeclaration.class);
        params.put(key2, refParams);

        jsonParam = idxParams.get(key3);
        refParams = RefactoringUtils.getOpersCodeObject(jsonParam, sysTypeDcls,
                MethodDeclaration.class);
        params.put(key3, refParams);

        return params;
    }

}
