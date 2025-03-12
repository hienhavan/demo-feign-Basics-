# Feign Demo - Spring Boot

## Giới thiệu
Dự án này là một demo cơ bản sử dụng **Spring Cloud OpenFeign** để gọi API bên ngoài. 

## Công nghệ sử dụng
- Java 23
- Spring Boot 3+
- Spring Cloud OpenFeign
- Lombok
- Gradle

###  Clone repository
```sh
git clone https://github.com/hienhavan/demo-feign-Basics-.git
cd demo-feign-Basics-
```
chuyển sang nhánh master

##  Sử dụng Feign Client
Feign Client được định nghĩa trong `IStaticService.java`:
```java
@FeignClient(name = "dogService", url = "https://dog.ceo/api/breeds/image/random", fallback = StaticService.class)
public interface IStaticService {
    @GetMapping("/")
    DogResponse getIDog();
}
```

### Gọi API bằng Feign
Trong controller:
```java
  @GetMapping("/get-IDog")
```

##  Kết quả mong đợi
Gọi API sẽ trả về:
```json
{
  "message": "https://images.dog.ceo/breeds/hound-afghan/n02088094_1003.jpg",
  "status": "success"
}
```

## Cấu hình thời gian kết nối và phản hổi
```java
    public Request.Options feignOptions() {
        return new Request.Options(5000, 5000);
    }
```
## fallback khi có lỗi 




