CREATE TABLE IF NOT EXISTS STUDENT (
                                          ID VARCHAR(255) NOT NULL,
                                          CLASS_NAME VARCHAR(255),
                                          NAME VARCHAR(255),
                                          PRIMARY KEY(ID)
);

-- 一意制約発生を避けるため、ON CONFLICTを使用
INSERT INTO STUDENT VALUES ('1','A CLASS','TAKA')
    ON CONFLICT DO NOTHING;
