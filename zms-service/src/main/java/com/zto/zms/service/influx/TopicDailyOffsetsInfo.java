/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zto.zms.service.influx;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;

import java.time.Instant;

import static com.zto.zms.common.ZmsConst.Measurement.STATISTIC_TOPIC_DAILY_OFFSETS_INFO;

/**
 * Created by liangyong on 2018/9/26.
 */
@Measurement(name = STATISTIC_TOPIC_DAILY_OFFSETS_INFO)
public class TopicDailyOffsetsInfo {

    @Column(name = "time")
    private Instant time;
    @Column(name = "clusterName", tag = true)
    private String clusterName;
    @Column(name = "topicName", tag = true)
    private String topicName;
    @Column(name = "name", tag = true)
    private String name;
    @Column(name = "value")
    private double value;

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}

