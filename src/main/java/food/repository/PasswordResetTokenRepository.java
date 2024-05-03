package food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
