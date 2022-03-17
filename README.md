# Jackson을 이용한 추상화 서비스 맛보기 (+ JDK 17)
-- --
## 목표
#### 1. jdk17의 switch 기능을 이용하여 추상화 전 legacy 서비스를 구현한다. (v1)
#### 2. jackson의 @JsonTypeInfo, @JsonSubtypes 어노테이션을 이용해 추상화 된 presentation layer를 제공 한다. (v2)
-- --
## 도메인
* Company
* Person
* Car
-- --
## API
* v1 api = (feature : 기능) - (1 : 1)
* v2 api = (feature : 기능) - (n : n)
-- --
## 기능
* 생성 (create)
* 조회 (list)
* 삭제 (delete)
> - 각각의 기능의 행위를 전송해주는 임의의 전달 매체가 있다. 
> - if else 구문은 jdk17의 feature를 따르도록 한다