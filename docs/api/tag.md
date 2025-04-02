# 标签管理API

## 创建标签
`POST /api/tag/create`

### 请求头
```
Authorization: Bearer {token}
```

### 请求参数
```json
{
  "name": "string",
  "color": "string"
}
```

### 响应示例
```json
{
  "code": 200,
  "message": "标签创建成功",
  "data": {
    "id": 1,
    "name": "技术"
  }
}

## 获取标签列表
`GET /api/tag/list`

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
        "color": "#FF5733"
      }
    ],
    "total": 1
  }
}

## 删除标签
`DELETE /api/tag/delete/{id}`

### 请求头
```
Authorization: Bearer {token}
```

### 响应示例
```json
{
  "code": 200,
  "message": "标签删除成功",
  "data": null
}