$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/goibibo.feature");
formatter.feature({
  "name": "Goibibo testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Perform oneway operation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to goibibo_oneway",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Booking.navigate_to_goibibo_oneway()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide the inputs to all fields_oneway",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Booking.provide_the_inputs_to_all_fields_oneway()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Review the page_oneway",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Booking.review_the_page_oneway()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform roundtrip operation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to goibibo_roundtrip",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Booking.navigate_to_goibibo_roundtrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide the inputs to all fields_roundtrip",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Booking.provide_the_inputs_to_all_fields_roundtrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Review the page_roundtrip",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Booking.review_the_page_roundtrip()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()\u003d\u0027Cheapest\u0027]/ancestor::div[contains(@class,\u0027justify\u0027)]/following-sibling::div//button\"}\n  (Session info: chrome\u003d96.0.4664.110)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027APL-5CD1394ZXP\u0027, ip: \u0027192.168.1.34\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.110, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\ADMINI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56969}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 38a944806178411584ee0df2bf12c119\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027Cheapest\u0027]/ancestor::div[contains(@class,\u0027justify\u0027)]/following-sibling::div//button}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:394)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat steps.Booking.BookCheapFlight(Booking.java:178)\r\n\tat steps.Booking.review_the_page_roundtrip(Booking.java:76)\r\n\tat ✽.Review the page_roundtrip(file:///C:/Users/Administrator/git/TestGoibibo/flight.booking/src/test/java/Feature/goibibo.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform multicity operation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to goibibo_multicity",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Booking.navigate_to_goibibo_multicity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide the inputs to all fields_multicity",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Booking.provide_the_inputs_to_all_fields_multicity()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#multiCity\"}\n  (Session info: chrome\u003d96.0.4664.110)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027APL-5CD1394ZXP\u0027, ip: \u0027192.168.1.34\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.110, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\ADMINI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57078}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: cc5ec298cde10de51101c2da9dbccac9\n*** Element info: {Using\u003did, value\u003dmultiCity}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:381)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:194)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat steps.Booking.provide_the_inputs_to_all_fields_multicity(Booking.java:90)\r\n\tat ✽.Provide the inputs to all fields_multicity(file:///C:/Users/Administrator/git/TestGoibibo/flight.booking/src/test/java/Feature/goibibo.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Review the page_multicity",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Booking.review_the_page_multicity()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});