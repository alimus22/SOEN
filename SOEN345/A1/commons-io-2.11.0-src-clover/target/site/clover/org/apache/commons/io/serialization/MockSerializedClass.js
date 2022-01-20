var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":27471,"methods":[{"el":30,"sc":5,"sl":28},{"el":35,"sc":5,"sl":32},{"el":43,"sc":5,"sl":37}],"name":"MockSerializedClass","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1113":{"methods":[{"sl":37}],"name":"ourTestClassAcceptedSecondWildcard","pass":true,"statements":[{"sl":39},{"sl":42}]},"test_1494":{"methods":[{"sl":37}],"name":"ourTestClassOnlyAccepted","pass":true,"statements":[{"sl":39},{"sl":42}]},"test_1531":{"methods":[{"sl":37}],"name":"acceptCustomMatcher","pass":true,"statements":[{"sl":39},{"sl":42}]},"test_1682":{"methods":[{"sl":37}],"name":"acceptWildcard","pass":true,"statements":[{"sl":39},{"sl":42}]},"test_1741":{"methods":[{"sl":37}],"name":"acceptPattern","pass":true,"statements":[{"sl":39},{"sl":42}]},"test_264":{"methods":[{"sl":37}],"name":"ourTestClassAcceptedSecond","pass":true,"statements":[{"sl":39},{"sl":42}]},"test_769":{"methods":[{"sl":37}],"name":"ourTestClassAcceptedFirst","pass":true,"statements":[{"sl":39},{"sl":42}]},"test_965":{"methods":[{"sl":37}],"name":"ourTestClassAcceptedFirstWildcard","pass":true,"statements":[{"sl":39},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1113, 769, 1741, 1682, 1531, 965, 264, 1494], [], [1113, 769, 1741, 1682, 1531, 965, 264, 1494], [], [], [1113, 769, 1741, 1682, 1531, 965, 264, 1494], [], []]
