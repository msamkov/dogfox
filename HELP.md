#Spring Security

### Basic 
Basic — наиболее простая схема, при которой username и password пользователя передаются
 в заголовке Authorization в незашифрованном виде (base64-encoded).

Text        Base64
foo:foo2    Zm9vOmZvbzI=

```
curl --location --request GET 'http://localhost:8080/hello' \
--header 'Authorization: Basic Zm9vOmZvbzI='
```