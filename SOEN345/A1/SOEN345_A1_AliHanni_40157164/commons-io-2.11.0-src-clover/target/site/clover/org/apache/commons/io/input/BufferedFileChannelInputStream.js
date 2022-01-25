var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":267,"id":5638,"methods":[{"el":60,"sc":5,"sl":52},{"el":64,"sc":5,"sl":62},{"el":74,"sc":5,"sl":72},{"el":85,"sc":5,"sl":83},{"el":95,"sc":5,"sl":93},{"el":109,"sc":5,"sl":104},{"el":114,"sc":5,"sl":111},{"el":129,"sc":5,"sl":125},{"el":188,"sc":5,"sl":139},{"el":197,"sc":5,"sl":190},{"el":205,"sc":5,"sl":199},{"el":218,"sc":5,"sl":207},{"el":236,"sc":5,"sl":225},{"el":254,"sc":5,"sl":238},{"el":265,"sc":5,"sl":256}],"name":"BufferedFileChannelInputStream","sl":44}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1003":{"methods":[{"sl":207},{"sl":225}],"name":"testReadMultipleBytes","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":215},{"sl":216},{"sl":217},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233}]},"test_1044":{"methods":[{"sl":199},{"sl":225},{"sl":238},{"sl":256}],"name":"testBytesSkippedAfterEOF","pass":true,"statements":[{"sl":201},{"sl":202},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":240},{"sl":243},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":260},{"sl":261}]},"test_1089":{"methods":[{"sl":207},{"sl":225},{"sl":238},{"sl":256}],"name":"testSkipFromFileChannel","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235},{"sl":240},{"sl":243},{"sl":245},{"sl":246},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":263},{"sl":264}]},"test_1192":{"methods":[{"sl":199},{"sl":225},{"sl":238},{"sl":256}],"name":"testBytesSkipped","pass":true,"statements":[{"sl":201},{"sl":204},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235},{"sl":240},{"sl":243},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":263},{"sl":264}]},"test_1228":{"methods":[{"sl":207},{"sl":225},{"sl":238},{"sl":256}],"name":"testNegativeBytesSkippedAfterRead","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235},{"sl":240},{"sl":243},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":263},{"sl":264}]},"test_1551":{"methods":[{"sl":207},{"sl":225},{"sl":238},{"sl":256}],"name":"testBytesSkippedAfterRead","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235},{"sl":240},{"sl":243},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":263},{"sl":264}]},"test_1596":{"methods":[{"sl":207},{"sl":225}],"name":"testReadOneByte","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235}]},"test_1810":{"methods":[{"sl":199},{"sl":225}],"name":"testReadOneByte","pass":true,"statements":[{"sl":201},{"sl":204},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235}]},"test_26":{"methods":[{"sl":207},{"sl":225},{"sl":238},{"sl":256}],"name":"testBytesSkipped","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235},{"sl":240},{"sl":243},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":263},{"sl":264}]},"test_288":{"methods":[{"sl":207},{"sl":225},{"sl":238},{"sl":256}],"name":"testBytesSkippedAfterEOF","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":213},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":240},{"sl":243},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":260},{"sl":261}]},"test_497":{"methods":[{"sl":207},{"sl":225}],"name":"testReadMultipleBytes","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235}]},"test_591":{"methods":[{"sl":199},{"sl":225},{"sl":238},{"sl":256}],"name":"testNegativeBytesSkippedAfterRead","pass":true,"statements":[{"sl":201},{"sl":204},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235},{"sl":240},{"sl":241},{"sl":243},{"sl":245},{"sl":246},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":263},{"sl":264}]},"test_702":{"methods":[{"sl":199},{"sl":225},{"sl":238},{"sl":256}],"name":"testSkipFromFileChannel","pass":true,"statements":[{"sl":201},{"sl":204},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235},{"sl":240},{"sl":243},{"sl":245},{"sl":246},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":263},{"sl":264}]},"test_706":{"methods":[{"sl":207},{"sl":225}],"name":"testReadPastEOF","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235}]},"test_895":{"methods":[{"sl":199},{"sl":225},{"sl":238},{"sl":256}],"name":"testBytesSkippedAfterRead","pass":true,"statements":[{"sl":201},{"sl":204},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":235},{"sl":240},{"sl":243},{"sl":245},{"sl":246},{"sl":248},{"sl":249},{"sl":251},{"sl":252},{"sl":253},{"sl":257},{"sl":258},{"sl":259},{"sl":263},{"sl":264}]},"test_989":{"methods":[{"sl":207},{"sl":225}],"name":"testReadPastEOF","pass":true,"statements":[{"sl":209},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1810, 702, 895, 591, 1192, 1044], [], [1810, 702, 895, 591, 1192, 1044], [1044], [], [1810, 702, 895, 591, 1192], [], [], [1003, 1551, 1089, 497, 989, 26, 706, 288, 1228, 1596], [], [1003, 1551, 1089, 497, 989, 26, 706, 288, 1228, 1596], [], [], [1003, 1551, 1089, 497, 989, 26, 706, 288, 1228, 1596], [1551, 1089, 497, 989, 26, 706, 288, 1228, 1596], [], [1003, 1551, 1089, 497, 989, 26, 706, 1228, 1596], [1003, 1551, 1089, 497, 989, 26, 706, 1228, 1596], [1003, 1551, 1089, 497, 989, 26, 706, 1228, 1596], [], [], [], [], [], [], [], [1810, 1003, 1551, 1089, 497, 702, 989, 895, 26, 706, 288, 591, 1192, 1228, 1596, 1044], [1810, 1003, 1551, 1089, 497, 702, 989, 895, 26, 706, 288, 591, 1192, 1228, 1596, 1044], [1810, 1003, 1551, 1089, 497, 702, 989, 895, 26, 706, 288, 591, 1192, 1228, 1596, 1044], [1810, 1003, 1551, 1089, 497, 702, 989, 895, 26, 706, 288, 591, 1192, 1228, 1596, 1044], [1810, 1003, 1551, 1089, 497, 702, 989, 895, 26, 706, 288, 591, 1192, 1228, 1596, 1044], [1810, 1003, 1551, 1089, 497, 702, 989, 895, 26, 706, 288, 591, 1192, 1228, 1596, 1044], [], [1810, 1003, 1551, 1089, 497, 702, 989, 895, 26, 706, 288, 591, 1192, 1228, 1596, 1044], [1810, 1003, 1551, 1089, 497, 702, 989, 895, 26, 706, 288, 591, 1192, 1228, 1596, 1044], [], [1810, 1551, 1089, 497, 702, 895, 26, 706, 591, 1192, 1228, 1596], [], [], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [591], [], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [], [1089, 702, 895, 591], [1089, 702, 895, 591], [], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [], [], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [1551, 1089, 702, 895, 26, 288, 591, 1192, 1228, 1044], [288, 1044], [288, 1044], [], [1551, 1089, 702, 895, 26, 591, 1192, 1228], [1551, 1089, 702, 895, 26, 591, 1192, 1228], [], [], []]