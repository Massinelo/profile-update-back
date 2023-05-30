DROP TABLE IF EXISTS profiles;

CREATE TABLE profiles (
    id SERIAL PRIMARY KEY,
    avatar VARCHAR(300),
    description VARCHAR(1000)
);