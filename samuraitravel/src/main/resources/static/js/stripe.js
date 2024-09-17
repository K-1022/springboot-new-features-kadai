const stripe =Stripe('pk_test_51Piuqm00ud9i0DTzPhxuUcZJ1UmEFhu4Pu5j63Ag1QQeS1kUv6FC2MMCsMyX7dFOvZsqZEpqsMmm5PTtzZPmVMol002UpqdvYb');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
})