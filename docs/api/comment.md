# 评论模块API

## 发布评论
`POST /api/comment/create`

### 请求头
```
Authorization: Bearer {token}
```

### 请求参数
```json
{
  "articleId": "number",
  "content": "string",
  "parentId": "number"
}
```

### 响应示例
```json
{
  "code": 200,
  "message": "评论成功",
  "data": {
    "id": 1,
    "content": "测试评论"
  }
}
```

## 获取评论列表
`GET /api/comment/list`

### 请求参数
```
articleId=1&page=1&size=10
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
        "content": "测试评论",
        "user": {
          "username": "testuser"
        }
      }
    ],
    "total": 1
  }
}
```

## 删除评论
`DELETE /api/comment/delete/{id}`

### 请求头
```
Authorization: Bearer {token}
```

### 响应示例
```json
{
  "code": 200,
  "message": "删除成功",
  "data": null
}
```