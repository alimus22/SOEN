var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":27574,"methods":[{"el":34,"sc":5,"sl":28},{"el":41,"sc":5,"sl":36},{"el":48,"sc":5,"sl":43}],"name":"WildcardClassNameMatcherTest","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1830":{"methods":[{"sl":36}],"name":"star","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40}]},"test_661":{"methods":[{"sl":43}],"name":"starAndQuestionMark","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47}]},"test_837":{"methods":[{"sl":28}],"name":"noPattern","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [837], [], [837], [837], [837], [837], [], [], [1830], [], [1830], [1830], [1830], [], [], [661], [], [661], [661], [661], [], [], []]
