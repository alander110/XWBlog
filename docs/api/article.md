# 文章模块API

## 文件上传
`POST /api/article/upload`

### 请求头
```
Authorization: Bearer {token}
Content-Type: multipart/form-data
```

### 请求参数
```
file: 文件内容
```

### 响应示例
```json
{
  "code": 200,
  "message": "文件上传成功",
  "data": {
    "url": "string",
    "size": "number",
    "type": "string"
  }
}
```

## 文件删除
`DELETE /api/article/file`

### 请求头
```
Authorization: Bearer {token}
```

### 请求参数
```json
{
  "url": "string"
}
```

### 响应示例
```json
{
  "code": 200,
  "message": "文件删除成功",
  "data": null
}
```

## 创建文章
`POST /api/article/create`

## 创建草稿
`POST /api/article/draft/create`

### 请求头
```
Authorization: Bearer {token}
```

### 请求参数
```json
{
  "title": "string",
  "content": "string",
  "categoryId": "number",
  "tags": ["string"]
}
```

### 响应示例
```json
{
  "code": 200,
  "message": "草稿创建成功",
  "data": {
    "id": 1,
    "title": "测试草稿"
  }
}

## 获取草稿列表
`GET /api/article/draft/list`

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
        "title": "测试草稿",
        "content": "草稿内容",
        "categoryId": 1,
        "tags": ["标签1"]
      }
    ],
    "total": 1
  }
}

## 删除草稿
`DELETE /api/article/draft/delete/{id}`

### 请求头
```
Authorization: Bearer {token}
```

### 响应示例
```json
{
  "code": 200,
  "message": "草稿删除成功",
  "data": null
}

### 请求头
```
Authorization: Bearer {token}
```

### 请求参数
```json
{
  "title": "string",
  "content": "string",
  "categoryId": "number",
  "tags": ["string"]
}
```

### 响应示例
```json
{
  "code": 200,
  "message": "创建成功",
  "data": {
    "id": 1,
    "title": "测试文章"
  }
}
```

## 获取文章列表
`GET /api/article/list`

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
        "summary": "文章摘要..."
      }
    ],
    "total": 1
  }
}
```

## 获取文章详情
`GET /api/article/detail/{id}`

### 响应示例
```json
{
  "code": 200,
  "message": "success",
  "data": {
    "id": 1,
    "title": "测试文章",
    "content": "文章内容...",
    "createTime": "2023-01-01 00:00:00"
  }
}
```

## 更新文章
`PUT /api/article/update/{id}`

### 请求头
```
Authorization: Bearer {token}
```

### 请求参数
```json
{
  "title": "string",
  "content": "string"
}
```

### 响应示例
```json
{
  "code": 200,
  "message": "更新成功",
  "data": null
}
```

## 删除文章
`DELETE /api/article/delete/{id}`

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

## 点赞文章
`POST /api/article/like/{id}`

### 请求头
```
Authorization: Bearer {token}
```

### 响应示例
```json
{
  "code": 200,
  "message": "操作成功",
  "data": {
    "liked": true
  }
}
```

## 获取点赞状态
`GET /api/article/like/status/{id}`

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
    "liked": true,
    "count": 10
  }
}
```

## 收藏文章
`POST /api/article/favorite/{id}`

### 请求头
```
Authorization: Bearer {token}
```

### 响应示例
```json
{
  "code": 200,
  "message": "操作成功",
  "data": {
    "favorited": true
  }
}
```

## 获取收藏状态
`GET /api/article/favorite/status/{id}`

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
    "favorited": true
  }
}
```