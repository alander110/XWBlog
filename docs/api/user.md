# 用户模块API

## 用户注册
`POST /api/user/register`

### 请求参数
```json
{
  "username": "string",
  "password": "string",
  "email": "string"
}
```

### 响应示例
```json
{
  "code": 200,
  "message": "注册成功",
  "data": {
    "id": 1,
    "username": "testuser"
  }
}
```

## 用户登录
`POST /api/user/login`

### 请求参数
```json
{
  "username": "string",
  "password": "string"
}
```

### 响应示例
```json
{
  "code": 200,
  "message": "登录成功",
  "data": {
    "token": "jwt_token_string",
    "userInfo": {
      "id": 1,
      "username": "testuser"
    }
  }
}

## 获取用户收藏列表
`GET /api/user/favorites`

### 请求头
```
Authorization: Bearer {token}
```

### 请求参数
```
page=1&size=10
```

### 响应示例
```json
{
  "code": 200,
  "message": "success",
  "data": {
    "list": [
      {
        "id": 1,
        "title": "测试文章",
        "content": "文章内容",
        "categoryId": 1,
        "tags": ["标签1"]
      }
    ],
    "total": 1
  }
}
```

## 获取用户信息
`GET /api/user/info`

### 请求头
```
Authorization: Bearer {token}
```

### 响应示例
```json
{
  "code": 200,
  "message": "success",
  "data": {
    "id": 1,
    "username": "testuser",
    "email": "test@example.com"
  }
}
```