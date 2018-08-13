####mockito简单小例子
    1.代码位置src/test/java/com.maoyan.qa.mock
    2.定义mock实现
    3.使用@InjectMocks将本类中的@mock和@spy注入到被标注对象中
    4.定义when-then-return：构造假的返回值
    5.必须使用MockitoAnnotations.initMocks(this);或@RunWith(MockitoJUnitRunner.class)进行初始化mock对象