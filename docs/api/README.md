# API文档

## 目录结构
1. [用户模块](./user.md)
2. [文章模块](./article.md)
3. [评论模块](./comment.md)

## 通用规范
- 请求头: Content-Type: application/json
- 响应格式: {"code": 200, "message": "success", "data": {}}
- 错误码: 
  - 400: 参数错误
  - 401: 未授权
  - 404: 资源不存在
  - 500: 服务器错误