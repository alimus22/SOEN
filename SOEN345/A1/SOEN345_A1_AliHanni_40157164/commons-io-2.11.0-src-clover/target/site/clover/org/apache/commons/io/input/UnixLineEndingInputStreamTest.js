var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":89,"id":23500,"methods":[{"el":33,"sc":5,"sl":30},{"el":38,"sc":5,"sl":35},{"el":43,"sc":5,"sl":40},{"el":48,"sc":5,"sl":45},{"el":55,"sc":5,"sl":50},{"el":62,"sc":5,"sl":57},{"el":67,"sc":5,"sl":64},{"el":74,"sc":5,"sl":70},{"el":78,"sc":5,"sl":76},{"el":87,"sc":5,"sl":80}],"name":"UnixLineEndingInputStreamTest","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1114":{"methods":[{"sl":70},{"sl":80}],"name":"retainLineFeed","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_1355":{"methods":[{"sl":30},{"sl":76},{"sl":80}],"name":"simpleString","pass":true,"statements":[{"sl":32},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_1407":{"methods":[{"sl":45},{"sl":76},{"sl":80}],"name":"twoLinesAtEnd","pass":true,"statements":[{"sl":47},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_180":{"methods":[{"sl":50},{"sl":76},{"sl":80}],"name":"crOnlyEnsureAtEof","pass":true,"statements":[{"sl":54},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_237":{"methods":[{"sl":64},{"sl":76},{"sl":80}],"name":"crAtEnd","pass":true,"statements":[{"sl":66},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_614":{"methods":[{"sl":35},{"sl":76},{"sl":80}],"name":"inTheMiddleOfTheLine","pass":true,"statements":[{"sl":37},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_904":{"methods":[{"sl":40},{"sl":76},{"sl":80}],"name":"multipleBlankLines","pass":true,"statements":[{"sl":42},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_968":{"methods":[{"sl":57},{"sl":80}],"name":"crOnlyNotAtEof","pass":true,"statements":[{"sl":61},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1355], [], [1355], [], [], [614], [], [614], [], [], [904], [], [904], [], [], [1407], [], [1407], [], [], [180], [], [], [], [180], [], [], [968], [], [], [], [968], [], [], [237], [], [237], [], [], [], [1114], [], [1114], [1114], [], [], [1355, 1407, 614, 904, 180, 237], [1355, 1407, 614, 904, 180, 237], [], [], [1114, 1355, 1407, 614, 968, 904, 180, 237], [1114, 1355, 1407, 614, 968, 904, 180, 237], [1114, 1355, 1407, 614, 968, 904, 180, 237], [1114, 1355, 1407, 614, 968, 904, 180, 237], [1114, 1355, 1407, 614, 968, 904, 180, 237], [1114, 1355, 1407, 614, 968, 904, 180, 237], [1114, 1355, 1407, 614, 968, 904, 180, 237], [], [], []]