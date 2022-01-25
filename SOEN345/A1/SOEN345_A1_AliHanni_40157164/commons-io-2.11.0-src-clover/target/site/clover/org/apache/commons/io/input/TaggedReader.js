var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":113,"id":7209,"methods":[{"el":78,"sc":5,"sl":76},{"el":88,"sc":5,"sl":86},{"el":100,"sc":5,"sl":98},{"el":111,"sc":5,"sl":108}],"name":"TaggedReader","sl":64}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1164":{"methods":[{"sl":76},{"sl":86},{"sl":98}],"name":"testOtherException","pass":true,"statements":[{"sl":77},{"sl":87},{"sl":99}]},"test_1258":{"methods":[{"sl":76},{"sl":86},{"sl":98},{"sl":108}],"name":"testBrokenReader","pass":true,"statements":[{"sl":77},{"sl":87},{"sl":99},{"sl":110}]},"test_1722":{"methods":[{"sl":76}],"name":"testEmptyReader","pass":true,"statements":[{"sl":77}]},"test_1813":{"methods":[{"sl":76}],"name":"testNormalReader","pass":true,"statements":[{"sl":77}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1164, 1258, 1722, 1813], [1164, 1258, 1722, 1813], [], [], [], [], [], [], [], [], [1164, 1258], [1164, 1258], [], [], [], [], [], [], [], [], [], [], [1164, 1258], [1164, 1258], [], [], [], [], [], [], [], [], [1258], [], [1258], [], [], []]
