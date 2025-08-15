CREATE TABLE tb_ovni (
    id UUID PRIMARY KEY,
    location VARCHAR(255),
    date_time TIMESTAMP,
    color VARCHAR(50),
    shape VARCHAR(50),
    quantity INT,
    CONSTRAINT chk_shape CHECK (shape in ('DISC', 'TRIANGLE', 'SPHERE', 'OTHER'))
);
