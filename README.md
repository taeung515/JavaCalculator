# JavaCalculator
단계별 계산기 만들기

---
## Lv1 계산기 - 기본 기능
### 요구사항
- 1. 양의 정수(0 포함)를 입력받습니다.
- 2. 사칙연산 기호 (+, -, *, /)를 입력받습니다.
- 3. 입력받은 두 수와 연산자를 사용해 결과값을 출력합니다.
- 4. "exit"을 입력하기 전까지 반복 실행되며, 사용자가 "exit"을 입력하면 프로그램이 종료됩니다.

---

## Lv2 계산기 - 객체지향 설계 도입
### 요구사항
- 1. Calculator 클래스 구현:
  - 사칙연산 결과를 반환하는 메서드 작성.
  - 연산 결과를 저장하는 컬렉션 필드 추가.
- 2. App 클래스 수정:
  - `App` 클래스의 `main()` 메서드에서 `Calculator` 클래스 활용.
- 3. 캡슐화 적용:
  - `Calculator` 클래스의 결과 컬렉션 필드에 직접 접근하지 못하도록 제한.
- 4. 삭제 기능 구현:
  - 연산 결과 중 가장 먼저 저장된 데이터를 삭제하는 메서드 작성.
  - `App` 클래스에서 이 메서드를 사용하여 삭제 기능을 제공.

---

## Lv3 - 고급 기능 확장
### 요구사항
- 1. Enum 타입으로 사칙연산 기호 정의:
  - 사칙연산 기호를 Enum으로 관리하고 연산 처리.
- 2. 실수(Double) 타입 지원:
  - 입력값이 실수일 경우에도 연산을 수행할 수 있도록 처리.
- 3. 결과 필터링:
  - 저장된 결과 중, 입력받은 값보다 큰 결과값만 출력.

---

## 사용 기술
- Java

---

## 실행 예시
### 콘솔에서의 실행 과정
1. 첫 번째 정수를 입력해 주세요: `3`
2. 두 번째 정수를 입력해 주세요: `5`
3. 사칙연산 기호를 입력하세요: `+`
4. 결과 출력: `8`
5. 더 계산하시겠습니까(enter)? (exit 입력 시 종료):
