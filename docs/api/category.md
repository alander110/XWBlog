# 分类管理API

## 创建分类
`POST /api/category/create`

### 请求头
```
Authorization: Bearer {token}
```

### 请求参数
```json
{
  "name": "string",
  "description": "string"
}
```

### 响应示例
```json
{
  "code": 200,
  "message": "分类创建成功",
  "data": {
    "id": 1,
    "name": "技术"
  }
}

## 获取分类列表
`GET /api/category/list`

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
        "name": "技术",
        "description": "技术相关文章"
      }
    ],
    "total": 1
  }
}

## 删除分类
`DELETE /api/category/delete/{id}`

### 请求头
```
Authorization: Bearer {token}
```

### 响应示例
```json
{
  "code": 200,
  "message": "分类删除成功",
  "data": null
}