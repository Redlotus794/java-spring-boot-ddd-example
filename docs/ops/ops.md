# 运维文档 - Operations

## 运维体系分类

- [部署运维（Deployment）](deployment/)：应用发布、CI/CD、自动化部署、灰度发布、回滚、环境管理。
- [备份与恢复（Backup & Restore）](backup-restore/)：数据备份、归档、容灾、恢复演练、备份有效性检查。
- [运行手册 / 标准化运维（Runbook）](runbook/)：标准操作流程、变更流程、故障处理手册、巡检手册。
- [监控告警（Monitoring & Alerting）](monitor/)：系统监控、日志监控、业务监控、告警策略、大盘、告警收敛。
- [故障与应急（Incident & Troubleshooting）](incident-troubleshooting/)：故障排查、应急响应、根因分析（RCA）、故障复盘。
- [配置管理（Configuration）](configuration/)：配置文件、环境变量、CMDB、配置中心、自动化配置（Ansible）。
- [资源与成本管理（Resource & Cost）](resource-cost/)：服务器/容器/云资源管理、资源利用率、成本优化、容量规划。
- [性能运维（Performance）](performance/)：压测、性能优化、慢查询、IO/CPU/内存优化、高并发保障。
- [安全运维（Security）](security/)：漏洞扫描、权限管理、防火墙、密钥管理、合规、入侵检测。
- [网络运维（Network）](network/)：网络设备、负载均衡、DNS、VPN、VPC、端口策略、网络连通性。
- [存储与数据运维（Storage & Data）](storage-data/)：磁盘、分布式存储、数据库运维、中间件（Redis、MQ、ES）。
- [自动化运维（Automation）](automation/)：脚本、平台化、自动化工具、定时任务、自愈能力。
- [变更管理（Change Log）](changelog/)：发布变更、配置变更、紧急变更、变更审核、变更风险控制。
- [日志运维（Log）](log/)：日志收集、存储、检索、审计、日志分析。

## 已迁移资料

- 发布说明：`deployment/release-note/*` -> `change-management/release-note/*`
- 运维脚本：`scripts/*`、`deployment/scripts/*` -> `automation/*`
- Docker 部署文档保留在 `deployment/docker/docker.md`
