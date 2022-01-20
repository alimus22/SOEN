var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":27464,"methods":[{"el":34,"sc":5,"sl":30},{"el":41,"sc":5,"sl":36}],"name":"FullClassNameMatcherTest","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1599":{"methods":[{"sl":30}],"name":"noNames","pass":true,"statements":[{"sl":32},{"sl":33}]},"test_321":{"methods":[{"sl":36}],"name":"withNames","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1599], [], [1599], [1599], [], [], [321], [], [321], [321], [321], [], []]
