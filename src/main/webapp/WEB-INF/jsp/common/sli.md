# Service Level Indicators

Microservices-based applications are highly service-driven. Monitoring is an essential part in such applications and provides the required observability.

Service Level Indicators (SLIs) are metrics that measure the system performance and health, in terms of latency, durability, availability of services, and so on. Prometheus scrapes the metrics and runs rules over this data to generate alerts and to create a time series. Significant knowledge about the service health state and performance is immediately presented based on the metrics that are ingested from the container framework.

Monitoring is based on the four golden signals of monitoring, which are the most important metrics that measure the system health and the performance:

*   *Latency and Duration* - The time it takes for the service to serve a request
*   *Traffic* - The measure of the amount of demand that is placed on the service
*   *Errors* - The rate or requests that fail
*   *Saturation and Utilization* - The measure of the system utilization

These golden signals help the system operators to monitor large-scale applications that are based on microservices.

## Application SLIs

All application metrics come from Chassis and therefore the monitoring dashboards are shared across all Spring Boot application microservices.

### Sample Metrics

The following table describes the sample metrics.

| Golden Signal | Metric | Source |
|---------------|--------|--------|
| Latency | `kafka_connect_start_time_seconds{namespace=~"$namespace",service=~"$service",pod=~"$pod"}` | Chassis |
| Traffic | `kafka_connect_connection_count{namespace=~"$namespace",service=~"$service",pod=~"$pod"}` | Chassis |
| Errors | `kafka_connect_worker_connector_failed_task_count{namespace=~"$namespace",service=~"$service",pod=~"$pod"}` | Chassis |
| Saturation | `system_cpu_usage{instance="10.65.131.219:8080", service="springboot2"}` | Chassis |

## Kafka Services SLIs

The metrics for Kafka come from various exporters, therefore it is necessary to have a dedicated dashboard for each Kafka service exporters.

Following are the Kafka service exporters:

*   [Kafka Exporter](https://github.com/danielqsj/kafka_exporter)
*   [Kafka JMX Exporter](https://github.com/prometheus/jmx_exporter)

Monitoring provides the Kafka JMX Exporter Helm chart for deployment of exporters.

### Kafka Broker State Values

The following table describes the Kafka broker states and statuses.

| Broker State | Kafka Broker Status |
|--------------|---------------------|
| 0 | Not Running extends Broker States |
| 1 | Starting extends Broker States |
| 2 | Recovering from Unclean Shutdown extends Broker States |
| 3 | Running as Broker extends Broker States |
| 4 | Running as Controller extends Broker States |
| 5 | Pending Controlled Shutdown extends Broker States |
| 6 | Broker Shutting Down extends Broker States |

### Dashboards

The following table describes the Kafka dashboards and metrics.

| Dashboard | Metric | Description                                                                                                                                 |
|-----------|--------|---------------------------------------------------------------------------------------------------------------------------------------------|
| Latency and Duration | amdocs_kafka_connect_couchbase_events_handlerRequestTime_seconds_count | The number of events handled per second                                                                                                     |
| | kafka_producer_batch_size_avg | The average number of bytes sent per partition per request                                                                                  |
| | kafka_consumer_incoming_byte_rate | The average number of incoming bytes received per second from all servers                                                                   |
| | kafka_producer_record_send_rate | The average number of records sent per second                                                                                               |
| | kafka_consumer_response_rate | The average number of responses received per second by consumer                                                                             |
| | kafka_producer_response_rate | The average number of responses sent per second by producer                                                                                 |
| | kafka_connect_worker_rebalance_time_since_last_rebalance_ms | The time in milliseconds since this worker completed the most recent rebalance                                                              |
| | kafka_consumer_fetch_manager_records_consumed_rate | The average number of records consumed per second                                                                                           |
| Traffic | kafka_connect_connector_task_batch_size_avg | The average size of the batches processed by the connector                                                                                  |
| | kafka_producer_network_io_total | The number of network operations (read and write) of Kafka producer                                                                         |
| | kafka_connect_network_io_total | The number of network operations (read and write) of Kafka connect                                                                          |
| | kafka_connect_coordinator_assigned_tasks | The number of assigned tasks of the connector on the worker                                                                                 |
| Errors | kafka_admin_client_failed_authentication_total | The number of connections with failed authentications by Kafka admin                                                                        |
| | kafka_producer_failed_authentication_total | The number of connections with failed authentications by Kafka producer                                                                     |
| | kafka_consumer_failed_authentication_total | The number of connections with failed authentications by Kafka consumer                                                                     |
| | kafka_connect_failed_authentication_total | The number of connections with failed authentications by Kafka connect                                                                      |
| | kafka_connect_worker_connector_startup_failure_total | The total number of connector starts that failed                                                                                            |
| | kafka_connect_worker_connector_failed_task_count | The number of failed tasks of the connector on the worker                                                                                   |
| | kafka_connect_task_error_total_errors_logged | The number of errors that are logged                                                                                                        |
| | kafka_connect_task_error_total_records_skipped | The number of records skipped due to errors                                                                                                 |
| | kafka_connect_task_error_total_record_errors | The number of record processing errors in a task                                                                                            |
| | kafka_connect_worker_task_startup_failure_total | The total number of task starts that failed                                                                                                 |
| | kafka_connect_task_error_total_record_failures | The number of record processing failures in a task                                                                                          |
| Saturation and Utilization | kafka_admin_client_connection_count | The current number of active connections of Kafka admin client                                                                              |
| | kafka_connect_connection_count | The current number of active connections of Kafka connect                                                                                   |
| | kafka_connect_connector_status | The status of the connector. The status can be any one of these, `unassigned`, `running`, `paused`, `failed`, or `destroyed`.               |
| | kafka_producer_connection_count | The current number of active connections of Kafka producer                                                                                  |
| | kafka_connect_worker_connector_count | The number of connectors run in the worker                                                                                                  |
| | kafka_connect_worker_task_count | The number of tasks run in the worker                                                                                                       |
| | kafka_consumer_connection_count | The current number of active connections of Kafka consumer                                                                                  |
| | kafka_connect_worker_connector_startup_success_total | The total number of connector starts that succeeded                                                                                         |
| | kafka_connect_worker_connector_total_task_count | The number of tasks of the connector on the worker                                                                                          |
| | kafka_consumer_fetch_manager_records_consumed_total | The total number of records consumed                                                                                                        |
| | kafka_consumer_fetch_manager_records_lag | The latest lag of the partition                                                                                                             |
| | amdocs_kafka_connect_couchbase_events_handled_total | The number of events handled by Kafka connect                                                                                               |
| | amdocs_kafka_connect_couchbase_event_create_success_total | The number of events created successfully                                                                                                   |
| | kafka_connect_request_total | The number of connect requests handled                                                                                                      |
| | kafka_connect_response_total | The number of connect responses handled                                                                                                     |
| | kafka_connect_worker_connector_running_task_count | The number of running tasks of the connector on the worker                                                                                  |
| | kafka_producer_record_send_total | The total number of records sent by a Kafka producer                                                                                        |
| | kafka_producer_outgoing_byte_rate | The number of outgoing bytes sent to all servers per second                                                                                 |
| | kafka_producer_request_rate | The number of requests sent per second                                                                                                      |
| | kafka_producer_compression_rate_avg | The average compression rate achieved by a Kafka producer                                                                                   |
| | kafka_producer_record_error_rate | The average per-second number of record sends that resulted in errors                                                                       |
| | kafka_producer_record_send_total | the total count of records sent by a Kafka producer. This metric provides insights into the overall volume of data produced by the producer |
| | kafka_producer_failed_authentication_rate | The number of connections with failed authentication per second                                                                             |
| | kafka_producer_failed_reauthentication_rate | The number of failed re-authentication of connections per second                                                                            |
| | kafka_producer_request_latency_avg | The average latency of requests made by a Kafka producer                                                                                    |
| | kafka_producer_io_wait_time_ns_avg | The average I/O (Input/Output) wait time experienced by a Kafka producer                                                                    |
| | kafka_producer_record_size_avg | The average size of records sent by a Kafka producer                                                                                        |
| | kafka_consumer_fetch_manager_bytes_consumed_rate | The average number of bytes consumed per second for a topic                                                                                 |
| | kafka_consumer_request_rate | The number of requests per second consumed by the Kafka topics                                                                              |
| | kafka_consumer_fetch_manager_fetch_rate | The number of fetch requests per second by the fetch manager of a Kafka consumer                                                            |
| | kafka_consumer_failed_authentication_rate | The number of connections with failed authentication per second or The rate at which authentication failures occur for a Kafka consumer     |
| | kafka_consumer_failed_reauthentication_rate | The number of failed re-authentication of connections per second for a Kafka consumer                                                       |
| | kafka_consumer_fetch_manager_fetch_latency_avg | The average fetch latency in the fetch manager of a Kafka consumer                                                                          |
| | kafka_consumer_io_wait_time_ns_avg | The average I/O (Input/Output) wait time experienced by a Kafka consumer                                                                    |
| | spring_cloud_stream_binder_kafka_offset | Unconsumed messages for a particular group and topic                                                                                        |
| | kafka_consumer_fetch_manager_records_per_request_avg | The average number of records fetched per request by the fetch manager of a Kafka consumer                                                  |
| | kafka_consumer_coordinator_assigned_partitions | The number of partitions currently assigned to this consumer                                                                                |








