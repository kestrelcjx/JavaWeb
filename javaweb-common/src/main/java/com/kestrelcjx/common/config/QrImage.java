package com.kestrelcjx.common.config;

public class QrImage {
    /**
     * 二维码内容（非空）
     */
    private String qrCodeContent;
    /**
     * 二维码宽度（非空）
     */
    private Integer qrCodeWidth;
    /**
     * 二维码高度（非空）
     */
    private Integer qrCodeHeight;
    /**
     * 二维码内嵌图片的文件路径（为空则表示：二维码中间不嵌套图片）
     */
    private String embeddedImgFilePath;
    /**
     * 文字大小（即：正方形文字的长度、宽度）（非空）
     */
    private Integer wordSize;
    /**
     * 文字内容（非空）
     */
    private String wordContent;
    /**
     * 二维码文件的输出路径（非空）
     */
    private String qrCodeFileOutputPath;

    /*                  构造器                  */

    public QrImage() {
    }

    public QrImage(String qrCodeContent, Integer qrCodeWidth, Integer qrCodeHeight,
                   String embeddedImgFilePath, Integer wordSize, String wordContent,
                   String qrCodeFileOutputPath) {
        this.qrCodeContent = qrCodeContent;
        this.qrCodeWidth = qrCodeWidth;
        this.qrCodeHeight = qrCodeHeight;
        this.embeddedImgFilePath = embeddedImgFilePath;
        this.wordSize = wordSize;
        this.wordContent = wordContent;
        this.qrCodeFileOutputPath = qrCodeFileOutputPath;
    }

    /*                  builder                */

    public static QrImage.QrImageBuilder builder() {
        return new QrImage.QrImageBuilder();
    }

    public static class QrImageBuilder {
        private String qrCodeContent;
        private Integer qrCodeWidth;
        private Integer qrCodeHeight;
        private String embeddedImgFilePath;
        private Integer wordSize;
        private String wordContent;
        private String qrCodeFileOutputPath;

        QrImageBuilder() {

        }

        public void qrCodeContent(String qrCodeContent) {
            this.qrCodeContent = qrCodeContent;
        }

        public void qrCodeWidth(Integer qrCodeWidth) {
            this.qrCodeWidth = qrCodeWidth;
        }

        public void qrCodeHeight(Integer qrCodeHeight) {
            this.qrCodeHeight = qrCodeHeight;
        }

        public void embeddedImgFilePath(String embeddedImgFilePath) {
            this.embeddedImgFilePath = embeddedImgFilePath;
        }

        public void wordSize(Integer wordSize) {
            this.wordSize = wordSize;
        }

        public void wordContent(String wordContent) {
            this.wordContent = wordContent;
        }

        public void qrCodeFileOutputPath(String qrCodeFileOutputPath) {
            this.qrCodeFileOutputPath = qrCodeFileOutputPath;
        }

        public QrImage build() {
            return new QrImage(qrCodeContent, qrCodeWidth, qrCodeHeight,
                    embeddedImgFilePath, wordSize, wordContent,
                    qrCodeFileOutputPath);
        }
    }

    /*               setter/setter             */

    public String getQrCodeContent() {
        return qrCodeContent;
    }

    public void setQrCodeContent(String qrCodeContent) {
        this.qrCodeContent = qrCodeContent;
    }

    public Integer getQrCodeWidth() {
        return qrCodeWidth;
    }

    public void setQrCodeWidth(Integer qrCodeWidth) {
        this.qrCodeWidth = qrCodeWidth;
    }

    public Integer getQrCodeHeight() {
        return qrCodeHeight;
    }

    public void setQrCodeHeight(Integer qrCodeHeight) {
        this.qrCodeHeight = qrCodeHeight;
    }

    public String getEmbeddedImgFilePath() {
        return embeddedImgFilePath;
    }

    public void setEmbeddedImgFilePath(String embeddedImgFilePath) {
        this.embeddedImgFilePath = embeddedImgFilePath;
    }

    public Integer getWordSize() {
        return wordSize;
    }

    public void setWordSize(Integer wordSize) {
        this.wordSize = wordSize;
    }

    public String getWordContent() {
        return wordContent;
    }

    public void setWordContent(String wordContent) {
        this.wordContent = wordContent;
    }

    public String getQrCodeFileOutputPath() {
        return qrCodeFileOutputPath;
    }

    public void setQrCodeFileOutputPath(String qrCodeFileOutputPath) {
        this.qrCodeFileOutputPath = qrCodeFileOutputPath;
    }
}
