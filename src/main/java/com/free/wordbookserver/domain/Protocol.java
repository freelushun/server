package com.free.wordbookserver.domain;

/**
 * 协议表  用来展示协议的内容
 */
public class Protocol {
    private Integer protocolId;

    private String protocolName;

    private String protocolComment;

    private String protocolContent;

    public Integer getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public String getProtocolComment() {
        return protocolComment;
    }

    public void setProtocolComment(String protocolComment) {
        this.protocolComment = protocolComment;
    }

    public String getProtocolContent() {
        return protocolContent;
    }

    public void setProtocolContent(String protocolContent) {
        this.protocolContent = protocolContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", protocolId=").append(protocolId);
        sb.append(", protocolName=").append(protocolName);
        sb.append(", protocolComment=").append(protocolComment);
        sb.append(", protocolContent=").append(protocolContent);
        sb.append("]");
        return sb.toString();
    }
}