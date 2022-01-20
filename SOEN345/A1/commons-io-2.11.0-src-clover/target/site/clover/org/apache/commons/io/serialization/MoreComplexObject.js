var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":27481,"methods":[{"el":47,"sc":5,"sl":43},{"el":52,"sc":5,"sl":49}],"name":"MoreComplexObject","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1070":{"methods":[{"sl":49}],"name":"useBlacklist","pass":true,"statements":[{"sl":51}]},"test_139":{"methods":[{"sl":49}],"name":"trustJavaIncludingArrays","pass":true,"statements":[{"sl":51}]},"test_1662":{"methods":[{"sl":49}],"name":"trustJavaLang","pass":true,"statements":[{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1662, 1070, 139], [], [1662, 1070, 139], [], []]
