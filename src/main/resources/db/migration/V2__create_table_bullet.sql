CREATE TABLE tb_bullet (
    id BIGSERIAL PRIMARY KEY,
    quantity NUMERIC NOT NULL,
    is_completed BOOLEAN NOT NULL,
    habit_id BIGINT REFERENCES tb_habit(id)
);